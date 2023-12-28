/*
 * EMPLOYEES AND SENIORITY LIST
 * 
 * PROBLEM;
 * Define a class called Employee with the name and Date of appointment. Create 5 employee 
   objects as an array and sort them as per their date of appointment. That is print them
   as per their seniority
 */

import java.util.*;
public class SortedEmplyee {
    Date doa;
    String name;

    SortedEmplyee (String newname,Date newdoa) {
        name = newname;
        doa = new Date();
        doa = newdoa;
    }
    void display() {
        System.out.println("Name: " +name+ "\nDate of Appointment: " +doa.getDate()+ "/" +doa.getMonth()+ "/" +doa.getYear());
    }
    public static void main(String[] args) {
        int k;
        SortedEmplyee e[] = new SortedEmplyee[5];

        e[0] = new SortedEmplyee("Diyo", new Date(23,3,22));
        e[1] = new SortedEmplyee("Peter", new Date(22,3,22));
        e[2] = new SortedEmplyee("Princeton", new Date(21,3,22));
        e[3] = new SortedEmplyee("Wangu", new Date(23,4,22));
        e[4] = new SortedEmplyee("Diyo", new Date(20,3,22));

        for (int i=0; i<4; i++) {
            for (int j=i+1; j<5; j++) {
                if (e[i].doa.after(e[j].doa)) {
                    Date tempdoa;
                    String tempName;
                    tempdoa = e[i].doa;
                    e[i].doa = e[j].doa;
                    e[j].doa = tempdoa;
                    tempName = e[i].name;
                    e[i].name = e[j].name;
                    e[j].name = tempName;
                }
            }
        }
        for (k=0; k<5; k++) {
            e[k].display();
        }
    }
}
