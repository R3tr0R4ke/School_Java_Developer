package School_Java_Developer.ScriptJava.Override.Esempio1;

class Bank 
{
    int getRateOfInterest(){return 0;}
}

class SBI extends Bank 
{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank 
{
    int getRateOfInterest(){return 7;}
}

class AXIS extends Bank
{
    int getRateOfInterest(){return 9;}
}