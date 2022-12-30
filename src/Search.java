import java.util.Scanner;


public class Search {


    public void  search(){

        int a;
        System.out.println("Wecome to Sorting System");

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for Liniar\n");
            System.out.println("Press 2 for Bainarary\n");

            System.out.println("Press 3 for Return to Home\n");
         
               a=sc.nextInt();
            
            switch(a)
            {
                    case 1:
                   Liniar();
                   
                                    break;
                    case 2:
                    Bainarary();
                                    break;
                    case 3: 

                   
                                    
                                    break;
   

                         
                    default:
                                  
                                 
                                    break;
            }
            sc.close();



    }
    

    }


    //____________

    public int Liniar(){

        return 0;

    }
    public int Bainarary(){

        return 0;

    }


}
