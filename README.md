# CovidTrace v1.
[![](https://raw.githubusercontent.com/t8190077/javadet/master/covidtracelogo.png)](https://raw.githubusercontent.com/t8190077/javadet/master/covidtracelogo.png)


The system creates a data.txt file if it does not exist but we will provide you with a data.txt file with inserted patients in order for you to see the programmes capabilities without having to insert patients first.

Keep the covidtracelogo.png in the same directory as the Covidtrace.jar file.


##  Description
CovidTrace is an easy-to-use application which can help hospitals manage their patients and also choose the best patients to vaccinate first, based on network science measures such as node degree.
As a hospital manager you can insert the patients that stay in ICUs(Intensive Care Units). You can manage the patients data, get a live statistical overview of the database and insert the people that each patient has been in contact with. Then with the jupyter notebook file you can see the live network of the disease spreading, and can make decisions on the line of vaccinations.

## Visuals
We have created an application that is easy-to-use while producing critical information. You are given a display, with buttons that correspond to commands. In the command textfield you can write the patients name in order to search or delete him. All errors and messages will be displayed in the display area, a custom terminal build for our program. In the jupyter notebook, all you need to do is run the whole file and at the end of the code blocks you will be able to see the patients network.

## Installation 
 To install the dependencies needed to run the jupyter notebook for mac os/linux type the following commands in your terminal:
 
 
 pip install matplotlib
 pip install pandas

To run the notebook type:

jupyter notebook Network.ipynb
 
 
 To run the .jar file do:
 
java -jar Covidtrace.jar

## Support


For any further explanations and support, you can contact us with an  email to *errikos.tzimas@gmail.com* or *koumpardass@gmail.com*.


## Usage
CovidTrace has 6 use cases. 

1. (ADD) You can add a patient by filling in his info in the assigned textfields. Amkachain should be the amkas of the people that the patients came in contact with separated by one space. Press add and await for confirmation message in the covidtrace terminal.

2. (STATISTICS)Press statistics for a statistical overview of your patients database.

3. (SEE ALL)Press see all for an overview of the patients in the system.

4. (SAVE) Press save to save changes.

5. (SEARCH BY NAME) Write a patients name in the command area, then press Search by Name button to search for a patient in the system.

6. (DELETE) Enter a patients name in the command area and press delete to delete patient from the system. Await for confirmation message in the covidtrace terminal.

[![](https://lh3.googleusercontent.com/pw/ACtC-3fohlPSNhuczCzWPte3O9jk9jnjwyQliYi25KIGNgv7VwCRish5O-fvY3fwJpKMiaBqD6Tt0PHDzddfhDNa847jyq-cmLgWiZwu5Ci7sI8b3_qzyFHniPnwl63L__IZk1jwF1skBGWlUOOyHTCFSvyh=w972-h216-no?authuser=0)](https://lh3.googleusercontent.com/pw/ACtC-3fohlPSNhuczCzWPte3O9jk9jnjwyQliYi25KIGNgv7VwCRish5O-fvY3fwJpKMiaBqD6Tt0PHDzddfhDNa847jyq-cmLgWiZwu5Ci7sI8b3_qzyFHniPnwl63L__IZk1jwF1skBGWlUOOyHTCFSvyh=w972-h216-no?authuser=0)

## License
The MIT License (MIT)

**Copyright (c) 2021 CovidTrace**

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THESOFTWARE.