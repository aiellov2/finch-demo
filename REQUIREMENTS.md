# Finch Robot: Setup Guide

1. [Requirements](#requirements)
2. [BlueBird Connector](#bluebird-connector)
3. [Java SDK](#java-sdk)
4. [VS Code](#vs-code)
5. [GitHub Desktop](#github-desktop)
6. [Git](#git)
7. [Installing GitHub Desktop](#installing-github-desktop)
8. [Installing Git](#installing-git)
9. [Cloning this Repo](#cloning-this-repo)
10. [Forking, Commiting, Pushing to GitHub](#forking-commiting-pushing-to-github)
10. [Demo Java File](#demo-java-file)
11. [Running Java Files](#running-java-files)


## Requirements
- BlueBird Connector
- Java SDK
- VS Code 
- GitHub Desktop
- Git

## BlueBird Connector
Find the BlueBird Connector app on the school desktop.

![bluebird connector icon](/assets/images/bluebird-connector.png)

<b>NOTE:</b> If you dont see the app, or it doesnt open, notify Aiello. This should have been installed by the school IT guru.


## Java SDK
1. Open the Command Prompt by searching `cmd` in the Windows taskbar.

![command prompt](/assets/images/command-prompt.jpg)

2. Type the following command:
`java --version`
3. If you get output like the following image, you have Java installed on the desktop!

![java version in command prompt](/assets/images/java-version.png)

<b>NOTE:</b> If you get output like `java: command not found`, notify Aiello. This should have been installed by the school IT guru.

## VS Code
Find the Visual Studio Code (VS Code) app on the school desktop.

![vs code icon](/assets/images/vs-code.png)

<b>NOTE:</b> If you dont see the app, or it doesnt open, notify Aiello. This should have been installed by the school IT guru.

## GitHub Desktop
Find the GitHub Desktop app on the school desktop.

![github desktop icon](/assets/images/github-desktop.png)

NOTE: If it's not installed, ask Aiello to install or follow the installation instruction below.

## Git
1. Open the Command Prompt by searching `cmd` in the Windows taskbar.
2. Type the following command:
`git -v`
3. If you get output like the following image, you have Git installed on the desktop!

![git version terminal](/assets/images/)

NOTE: If its not installed, ask Aiello to install or follow the installation instruction below.

## Installing GitHub Desktop
NOTE: Ask Aiello to install if you dont feel comfortable doing it

1. Go to https://desktop.github.com/download/ to download the software.
![github desktop download link](/assets/images/dowload-github-desktop.png)
2. Open the file you downloaded to install the software.
![github desktop install](/assets/images/github-desktop-exe.png)
3. Click `Sign in to GitHub.com` and sign in to your GitHub accounts through the browser
![github desktop sign in](/assets/images/github-desktop-login.png)
4. Verify your GitHub account has been transfered to GitHub Desktop.
![github desktop signed in](/assets/images/github-desktop-signed-in.png)

## Installing Git
NOTE: Ask Aiello to install if you dont feel comfortable doing it
1. When you open VS code, click on the blue button `Download Git` if prompted:
![git vs code button](/assets/images/vscode-git-extension.png)
Or go to this link: https://git-scm.com/downloads
![git download link](/assets/images/git-download.png)
2. Download the Windows version of Git. Make sure you are downloading the `Windows/x64 Setup` version.
![git ](/assets/images/git-download2.png)
3. Go through the installer use the default settings by pressing `Next` EXCEPT the following:
- Check the `Add a Git Bash Profile to the Windows Terminal`
![git bash profile](/assets/images/git-components.png)
- Choose from the dropdown menu `Use Visual Studio Code as Git's default editor`
![git vs code default](/assets/images/git-ide.png)
4. Verify Git is install by opening the command prompt and typing `git -v` (If you had the command prompt open when installing git, make sure to use a new cmd prompt by closing and opening the program)
![git version termical](/assets/images/)

## Cloning this Repo

1. Open GitHub Desktop and make sure you are signed in.

2. Click on the button `Clone a repository from the Internet...` 
![github desktop clone repo](/assets/images/github-desktop-clone-repo.png)

3. Click on the "URL" tab and use the following GitHub repo `heytonyy/finch-robot-project`
![github desktop url](/assets/images/github-desktop-url.png)

4. After finish cloning, click "Open the project in VS Code"
![github desktop open in vs code](/assets/images/github-desktop-vscode-open.png)

5. Start coding in the `src/main/java` directory
![main directory](/assets/images/vscode-main-directory.png)

## Forking, Commiting, Pushing to GitHub
1. After making any changes local project code base, on GitHub desktop you will see those "commits" (updates). You will need to "fork" the repo, which will make a difference reference than the original (think "Save and make copy" in Google Doc). Click the "Create a Fork" link in the bottom left corner of GitHub desktop
![fork](/assets/images/fork.png)

2. When the menu opens up, click "Fork this Repository"
![fork2](/assets/images/fork2.png)

3. In the next menu, click "For my own purposes" and then click "Continue". This will make your own repo on GitHub that is not the same branch as the propject template.
![fork3](/assets/images/fork3.png)

4. In the bottom left of GitHub desktop, you can now "stage commits" to your own repo/ Put the message "init commit" to stage the initial commit. 
![commit](/assets/images/commit.png)

5. In the main screen on GitHub desktop, you will now see option to "Push commits to the origin remote." Click that button and your repo will be now on your GitHub with the changes!  
![push](/assets/images/push.png)

**NOTE**: You will need to continue to "commit" new changes every day in class, and "push" the changes to your GitHub at the end of class. This is software development!

## Demo Java File

Check out the `src/main/java/com/example/FinchDemo.java` file for an example of how to use the Finch robot.

## Running Java Files

1. In VS Code, press <code>ctrl + `</code> to open your terminal in VS Code
2. Type `ls` to see the files in your current directory. If you dont see your project's `.java` file you will need to navigate to the directory with the `.java` file you are executing
3. he comand `cd` will change your current directory, aka move to a different folder. You just need to provide the path to the directory.
    - Typically you will just need to type: `cd src/main/java/com/example`
4. Type `java` then the name of your java file to run
    - Ex: `java FinchDemo.java`