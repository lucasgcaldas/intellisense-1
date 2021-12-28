# 🚀Backend Challenge - SWAPI - Intellisense

### ⚔️ The Challenge

Get the data from SWAPI API and exhibit the results visually, find the characters who appear the most in the SW movies, verify how many pilots did the Millenium Falcon and the names.

### ✔️ Solution

- [ ] Create a Maven project;
- [ ] Adding some dependencies;
- [ ] Create tree packages: application, model and sw;
- [ ] In the package model, create Film, People, Root, StarShip classes, to serialzie the json from api to java object;
- [ ] In the package sw, create a SW Interface to access the http protocol using GET;
- [ ] In the package sw, create a SWApi class to get connection to SWAPI;
- [ ] In the package application, create a Main class to introduce all logic
- [ ] In the Main class
- In the *main* method use a for to road all API pages and add into list of list all people from films; 
- In the *isEqual* method use a for to add all String names of all movies and than, use stream to find the persons who appear more than 5 times;
- In the *names* method, get the names who appears more;
- In the *pilots* method use a for to road all API pages and add into list of list all people from pilots;
- In the *people* method, get the pilot names;
 
### 🏁 Result

![image](https://user-images.githubusercontent.com/88175144/147522340-292c893f-5c8a-430b-b284-efd5c51f4cdb.png)
