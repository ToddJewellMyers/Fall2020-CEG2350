Name: Todd J Myers 
Email: Myers.371@wright.edu


Part 1 
1.  I used ls to display my current files I then use cd Fall2020-CEG2350 this puts me in the github folder I created in lab 1 
2.  to create a new directory we use mkdir then call it Lab02
3.  I use cd Lab02 to go into the folder then use mkdir DirA and another mkdir for Directory B
4.  becaseu fo the space in Directory B it make two seperate folders one Directrory and the other just B i noticed this when i used ls -l showing 
the seperate folders DirA making the name inbalanced. so obviously the DirA has the better naming convention 
5.  you have two folders now I renamed the Directory into DirB and left B alone since not advised to anything with it.

Part 2 
1 and 2.   I used cd DirA to go into the folder to make the text file. then i used vim to create and then paste the intro to the safety dance song 
then using esc and used :wq to save and exit the text.

part 3 
1 and 2.  using cp I make a copy and rename the folder to .hidden.text
3.   I typed ls and only one file is displayed test.txt. so then i used the flag -a with ls makign ls -a and it displayed the hidden text file

part 4
1.  we have a file the user, group and other says -rw-rw-r--  so read and write for user read and write for group and read for other 
the name for the user is ubuntu the group is also named ubuntu 
2.  using the combination of sudo cp i copied the test.txt with a new su-test.txt
3.  using ls -lah it shows that user group and other is listed as -rw-r--r-- meaning the user is read and write permissions 
group has read as well as other. the owner is root and the group name is root as well.
4.  the user is able read the text but not write on the text file. using echo " whatever you want to add here" >> su-test.txt i can write to the file 
5.  using sudo chown ubuntu su-test.txt it now changes the permission of the owner, now using sudo chgrp ubuntu su-test.txt 

part 5 
1.  using only ln and a filename only displays an error message that it failed to create a hard link.
2.  using ln test.txt hard.txt makes the link we need
3.  i use stat on test.txt and on hard.txt and they both get 285076 as there inode number
4.  made a symbolic link called sym.txt
5.  the inode is 285077 and is not the same as the one before so if soemthign happens liek deletion of this copy it wont affect the others
6.  i removed test.txt with rm and both texts are still readable 
7.  i removed hard.txt and sym.txt is not readable because the original inode number is gone it cannot find the file the link we made to show the contents
8.  making the new file changed nothing it still wont display the text within the sym.txt because without one with the orginal inode it wont work being a 
symbolic link they have a different inode number then orginal 
9.  moving the hard.txt to another directory makes sym.txt break since it can no longer follow the trail of the text file to display it 
10. deleted sym.txt with rm 
11. link created ln --symbolic 

part 6
1. at first when i tried to commit it would not allow me to saying it wanted me to tell me who it was so i used git config --global user.Email
todd1988myers@gmail.com then i tried again it was successful added my comment then saved and pushed it along 
2. created the file with Lab02 called README.md

