import java.util.Scanner;

public class Sorting {
    public void sort(){
        int a;
        System.out.println("Wecome to Sorting System");

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for Buubble\n");
            System.out.println("Press 2 for count\n");
            System.out.println("Press 3 for Selection\n");
            System.out.println("Press 4 for Insertion\n");
            System.out.println("Press 5 for Radix\n");
            System.out.println("Press 6 for Return to Home\n");
         
               a=sc.nextInt();
            
            switch(a)
            {
                    case 1:
                    bubleSort();
                   
                                    break;
                    case 2:
                    count();
                                    break;
                    case 3: 

                    selection();
                                    
                                    break;
                    case 4:
                    Insersiton();
                                    break;
                    case 5:
                    Radix();
                                    break;
                    case 6:
               
                                    break;

                         
                    default:
                                  
                                 
                                    break;
            }
            sc.close();



    }
    

    }


    //____________

    public int bubleSort(){

        return 0;

    }
    public int count(){

        return 0;

    }
    public int selection(){

        return 0;

    }
    public int Insersiton(){

        return 0;

    }
    public int Radix(){

        return 0;

    }
}
