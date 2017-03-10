import javax.swing.JOptionPane;
public class Quiz{
public static void main (String args[]){
int counter = 0;
double total = 0,answer,mtotal = 1;
JOptionPane.showMessageDialog(null, "Welcome to a four function calculator", "Calculator", JOptionPane.PLAIN_MESSAGE);
String choice = JOptionPane.showInputDialog("What would you like to do?\nAddition-1\nSubtract-2\nMultiply-3\nDivide-4");
Integer test = Integer.parseInt(choice);
if (test == 1){
JOptionPane.showMessageDialog(null,"You have chosen addition", "Addition", JOptionPane.PLAIN_MESSAGE);
String numchoice = JOptionPane.showInputDialog("How many numbers would you like to add together?");
Integer num = Integer.parseInt(numchoice);
while (counter < num){
String operation = JOptionPane.showInputDialog("Enter the numbers 1 at a time");
Double grade = Double.parseDouble(operation);
total = total + grade;
counter++;
}
answer = total;
JOptionPane.showMessageDialog(null, "The answer is " +answer, "The Answer", JOptionPane.PLAIN_MESSAGE);
}if (test == 2){
JOptionPane.showMessageDialog(null,"You have chosen subtraction", "Subtraction", JOptionPane.PLAIN_MESSAGE);
String strngstrtnum = JOptionPane.showInputDialog("Enter the starting number");
Double strtnum = Double.parseDouble(strngstrtnum);
String numchoice = JOptionPane.showInputDialog("How many numbers would you like to subtract?");
Integer num = Integer.parseInt(numchoice);
while (counter < num){
String operation = JOptionPane.showInputDialog("Enter the numbers you want to subtract 1 at a time");
Double grade = Double.parseDouble(operation);
total = total + grade;
counter++;
}
answer = strtnum - total;
JOptionPane.showMessageDialog(null, "The answer is " +answer, "The Answer", JOptionPane.PLAIN_MESSAGE);
}if (test == 3){
JOptionPane.showMessageDialog(null,"You have chosen muliplacation", "Muliplacation", JOptionPane.PLAIN_MESSAGE);
String numchoice = JOptionPane.showInputDialog("How many numbers would you like to multiply together?");
Integer num = Integer.parseInt(numchoice);
while (counter < num){
String operation = JOptionPane.showInputDialog("Enter the numbers 1 at a time");
Double grade = Double.parseDouble(operation);
mtotal = mtotal * grade;
counter++;
}
answer = mtotal;
JOptionPane.showMessageDialog(null, "The answer is " +answer, "The Answer", JOptionPane.PLAIN_MESSAGE);
}if (test == 4){
JOptionPane.showMessageDialog(null,"You have chosen division", "Division", JOptionPane.PLAIN_MESSAGE);
String fn = JOptionPane.showInputDialog("Enter the first number");
String sn = JOptionPane.showInputDialog("Enter the second number");
Double fnum = Double.parseDouble(fn);
Double snum = Double.parseDouble(sn);
answer = fnum / snum;
JOptionPane.showMessageDialog(null, "The answer is " +answer, "The Answer", JOptionPane.PLAIN_MESSAGE);
}
}}