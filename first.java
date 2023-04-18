import java.io.*;
class student
{
int rno;
final int size=5;
String name;
int mark[]=new int[size];
int tot;
float avg;
//Assignning values to variables and arrays
void set(int r,String s,int []m)
{
	rno=r;
	name=s;
	for(int i=0;i<m.length;i++)
	mark[i]=m[i];
}
//Calculate the total and average of an array
void cal()
{
	int n=mark.length;
	tot=0;
	for(int i=0;i<n;i++)
	tot=tot+mark[i];
	avg=tot/n;
}
//Displaying the student details
void disp()
{
	System.out.println("RollNo:"+rno);
	System.out.println("Name:"+name);
	System.out.println("Marks:");
	for(int i=0;i<mark.length;i++)
	System.out.println(mark[i]);
	System.out.println("Total:"+tot);
System.out.println("Avg:"+avg);
}
}
//Main method class
class stud
{
public static void main(String args[ ])
{
student s=new student();	//Object creation
int mark[]={80,90,85,80,90};
// Methods invocation or calling
s.set(1,"thiru",mark);		
s.cal();				
s.disp();
}
}

