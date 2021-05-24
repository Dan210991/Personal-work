#Author:                Daniel Pusey
#Student Number:        1702085
#Course:                BSc Computer Science with Foundation Year
#University Email:      D.Pusey@wlv.ac.uk
#Supervisor:            DR Vinita Nahar
#Date Created:          26/11/2020
#Last Updated:          10/05/2021


#Project Title:         Real-time Twitter data analysis for opinion and trend detection.

#Academic Question:     How effective can social media platforms be to analyse and report on opinions and trends.


##########################################################

#This Artefact was developed using Python IDLE 3.9.2

##########################################################

#Imported Libraries for Connection to Twitter
import os
from os import path
import tweepy
from tweepy import OAuthHandler
from tweepy import Stream
from tweepy.streaming import StreamListener


#Imported Generic Libraries
import time
import json
import random
import string
import re
import csv
import numpy as np
import pandas as pd
import codecs
import warnings
from PIL import Image
from wordcloud import WordCloud, STOPWORDS, ImageColorGenerator
import matplotlib.pyplot as plt
import seaborn as sns

#Imported Sentiment Analysis Libraries
import nltk
from nltk.sentiment.vader import SentimentIntensityAnalyzer


##########################################################

nltk.downloader.download('vader_lexicon')

##########################################################


#Twitter Developer Keys


APIKey = ("")

APISecretKey = ("")

BearerToken = ("")

AccessToken = ("")

AccessTokenSecret = ("")
                       
##########################################################







#Function For Main Menu


def Main_Menu():
    print("")
    print("")
    print("It is heavily recommended that before running or using this\n"
          "application that any new user should read the ReadMe.txt file\n"
          "found in the application files of this program.\n")
    
    UserChoice = input("\n\n===================================================\n\n"
                       "Welcome User, please enter a number for one of the following options:\n\n"
                       "1.Terminate program.\n"
                       "2.Display current Twitter keys.\n"
                       "3.Gather home timeline tweets.\n"
                       "4.Search for tweets.\n"
                       "5.Start Sentiment analysis procedure. (Must have ran option 4 before using this)\n"
                       "6.Create Word cloud based on data in Tweet.json\n"
                       "\n\n===================================================\n\n")
    print("")

    #If user selects option 1, Termination of program function
        
    if UserChoice == ("1"):
        Terminate = input("are you sure you wish to terminate program? Y/N")
        if Terminate == ("Y") or ("y"):
            exit(0)
        elif Terminate == ("N") or ("n"):
            Main_Menu()

    #If user selects option 2, Prints current API keys and Bearer/Access tokens

    elif UserChoice == ("2"):
        
        print ("Twitter Keys: \n\n")
        print ("APIKey: ", APIKey)
        print ("APISecretKey: ", APISecretKey)
        print ("BearerToken: ", BearerToken)
        print ("AccessToken: ", AccessToken)
        print ("AccessTokenSecret: ", AccessTokenSecret)
        print ("\n\n")
        
        Main_Menu()

    #If user selects option 3, Connects to twitter and prints off tweets on the users home screen
    #(this is dependant on whos account is used by the API keys)

    elif UserChoice == ("3"):
        auth = tweepy.OAuthHandler(APIKey, APISecretKey)                                                #Connects to twitter account associated with API keys
        auth.set_access_token(AccessToken, AccessTokenSecret)                   

        api = tweepy.API(auth)

        public_tweets = api.home_timeline()
        for tweet in public_tweets:
            print("===================================================")
            print("")
            print("")
            print(tweet.text)                                                                           #Prints Tweet
            print("")
            print("===================================================")

        Main_Menu()

    


    #If user selects option 4, connects and searches twitter for key phrases listed.

    #This is a basic listener that just prints received tweets to stdout.

    elif UserChoice == ("4"):
        print("IMPORTANT PLEASE READ\n")
        print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        print("Upon entering a search term the program will begin to search through twitter\n"
              "for tweets that match the inputted term. While the program is running these\n"
              "Tweets will be stored in a local Json file defaultly called 'Tweet.JSON'.\n"
              "If you wish to stop the stream this can be done by using a keyboard interrupt\n"
              "(Ctrl+C) at which point the program will be killed and stop writing data to the file.\n"
              "You should then restart the application and run option 5 for the program\n"
              "to begin performing sentiment analysis.\n")
        
        print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n")
        SearchQuery = input("What subject do you wish to search for? \n")

        print("Searching for:",SearchQuery)
        print ("\n################################\n")
        
        class StdOutListener(tweepy.streaming.StreamListener):
            def on_data(self, tweet):

                decoded = json.loads(tweet)
                
                Fulltext = False

                screen_name = decoded['user']['screen_name']
                tweet_created_at = decoded['created_at']
                
                print ("\n################################\n")
                if "retweeted_status" in decoded:                                           # Check if Retweet
                    if "extended_tweet" in decoded["retweeted_status"]:
                        print("Retweet FT")
                        print(decoded["retweeted_status"]["extended_tweet"]["full_text"])
                        saveFile = open('Tweet.json', 'a', encoding="utf-8")
                        saveFile.write(decoded["retweeted_status"]["extended_tweet"]["full_text"])
                    else:
                        print("Retweet T")
                        print(decoded["retweeted_status"]["text"])
                        saveFile = open('Tweet.json', 'a', encoding="utf-8")
                        saveFile.write(decoded["retweeted_status"]["text"])
                else:
                    if "extended_tweet" in decoded:
                        print("None Retweet FT")
                        print(decoded["extended_tweet"]["full_text"])
                        saveFile = open('Tweet.json', 'a', encoding="utf-8")
                        saveFile.write(decoded["extended_tweet"]["full_text"])
                    else:
                        print("None Retweet T")
                        print(decoded["text"])
                        saveFile = open('Tweet.json', 'a', encoding="utf-8")
                        saveFile.write(decoded["text"])

                        
                print ("") 
                print (screen_name)
                print (tweet_created_at)
                try:
                    saveFile.write('\n')
                    saveFile.close()
                    return True
                except BaseException (e):
                    print("Failed ondata,",str(e))

            def on_error(self, status):
                print (status)
                


        #This handles Twitter authetification and the connection to Twitter Streaming API
                
        l = StdOutListener()
        auth = OAuthHandler(APIKey, APISecretKey)
        auth.set_access_token(AccessToken, AccessTokenSecret)
        stream = Stream(auth, l)
        
        #Filter Twitter Streams to gather data by inputted query:
        
        stream.filter(languages=["en"], track=[SearchQuery])

        Main_Menu()


#If option 5 is selected, Sentiment analysis of the created stream file




    elif UserChoice == ("5"):
        print ("option 5")

        warnings.filterwarnings('ignore')
        tweets = codecs.open("Tweet.json", "r", "utf-8")

        text = []
        for t in tweets:
            text.append(t.lower())


        pos_tweets = []
        neg_tweets = []
        irrelevant = []
        
        wordList = []
        
        for t in text:
            wordList.append(t.split())


        print("")
        print("")

        sid = SentimentIntensityAnalyzer()
        c = 0

        
        
        for t in text:
            c +=1
            print(c)
            print(t)
            
            ss = sid.polarity_scores(t)

            print(ss)

            # Convert the analysis score into a float
            (compoundf) = float(ss['compound'])

            # If the analysis shows that it is positive
            if((compoundf) >= 0.05):
                print('positive')
                pos_tweets.append(t)

            # If the analysis shows that it is negative
            elif((compoundf) <= -0.05):
                print('negative')
                neg_tweets.append(t)

            # Otherwise it was neutral
            else:
                print('neutral')
                irrelevant.append(t)
            print('\n\n')
                
                
        #print(len(pos_tweets))
        #print(len(neg_tweets))
        #print(len(irrelevant))

        print ("\n################################\n")

        print("Tweets analysed and sorted\n")

        print("File Created: positive.csv")
        print("File Created: negative.csv")
        print("File Created: irrelevant.csv\n\n")

        posLabel = pd.DataFrame(columns=['positive'])
        negLabel = pd.DataFrame(columns=['negative'])
        irrLabel = pd.DataFrame(columns=['irrelevant'])
               

        negLabel['negative'] = neg_tweets
        negLabel.head()
        
        
        posLabel['positive'] = pos_tweets
        posLabel.head()

        irrLabel['irrelevant'] = irrelevant
        irrLabel.head()

        
        posLabel.to_csv('positive.csv')
        negLabel.to_csv('negative.csv')
        irrLabel.to_csv('irrelevant.csv')


        Main_Menu()

    elif UserChoice == ("6"):

        tweets = codecs.open("Tweet.json", "r", "utf-8")

        text = []
        for t in tweets:
            text.append(t.lower())
        all_text = " ".join(t for t in text)
        print("Close word cloud to continue")

        # Creating a stopword list
        stopwords = set(STOPWORDS)
        stopwords.update(["br", "im", 'RT','https','gt','go','co'])
        # Generating a word cloud image
        wordcloud = WordCloud(stopwords=stopwords, background_color="white").generate(all_text)
        # Displaying the image
        plt.imshow(wordcloud, interpolation='bilinear')
        plt.axis("off")
        plt.show()
        #save the generated image to a file
        wordcloud.to_file("wordcloud.png")
        
        
        

        
        Main_Menu()
            
    else:
        print("INVALID SELECTION MADE!! PLEASE SELECT AN OPTION FROM THE LIST\n\n")
        Main_Menu()

        
Main_Menu()

##########################################################































