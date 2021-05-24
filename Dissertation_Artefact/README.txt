Author:                Daniel Pusey
Student Number:        1702085
Course:                BSc Computer Science with Foundation Year
University Email:      D.Pusey@wlv.ac.uk
Supervisor:            DR Vinita Nahar
Date Created:          26/11/2020
Last Updated:          10/05/2021


Project Title:         Real-time Twitter data analysis for opinion and trend detection.

Academic Question:     How effective can social media platforms be to analyse and report on opinions and trends.


##########################################################

This Artefact was developed using Python IDLE 3.9.2 and it is higly recommended that it be ran in the same version.

##########################################################

Artefact file name:          Dissertation program(must be ran in 3.9).py


The artefact is designed to be ran using the files within the primary folder and secondary folders.



WARNING:

If attempting to run this from github you will need all the external libraries and a Twitter developers account with valid API keys
Otherwise the program will not work and crash on execution



Known Issue 1:

when launching the artifact it is recommended to open the code within the idle viewer then run the module,
this gives a chance for any errors to be displayed within the artefact. rather then the program terminating instantly.
whilst testing had been carried out an issue was found where during the searching tweets the "user" parameter on 174 would
cause an error, this is fixed by saving the file, removing the user parameter on line 174 and running the program.
the program will error again because of the missing parameter, then undoing what was done previously by adding back
in the user parameter will fix the error.


Known Issue 2:

If the user launches the artifact and tries to start the sentiment analysis procedure without there being a tweet.json
file present, the application will crash. there is a warning within the main menu that states option 4 should be ran before
the sentiment analysis procedure.

