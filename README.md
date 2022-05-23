# Introduction to Docker for Java Developers
This is the repository for the LinkedIn Learning course Introduction to Docker for Java Developers. The full course is available from [LinkedIn Learning][lil-course-url].

![Introduction to Docker for Java Developers][lil-thumbnail-url] 

Docker—a leading software container platform—can simplify the overall application delivery experience by providing a common platform for collaboration. Docker integrates seamlessly with existing tool chains, making it easier to deliver software rapidly if you’re running a Java application. In this course, instructor Mary Ellen Bowman helps you discover how to get started with Docker, with tips and tricks tailored specifically for Java developers working with the platform.

Learn how the Docker engine provides an easy-to-build runtime environment, a must-have for Java developers. Explore the magic of using Docker to build and run a java application without installing Maven, Tomcat, or the required version of Java. Along the way, Mary gives you pointers on best practices for containerization and using dockerfile alternatives such as Cloud Native Buildpacks and plugins for Google Jib and Spring Boot.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
	- [Docker Desktop](https://www.docker.com/products/docker-desktop)
	- Java version 11
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.

### Instructor

Mary Ellen Bowman 
                            
Senior Software Developer

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/mary-ellen-bowman).

[lil-course-url]: https://www.linkedin.com/learning/introduction-to-docker-for-java-developers
[lil-thumbnail-url]: https://cdn.lynda.com/course/2452212/2452212-1652976316397-16x9.jpg
