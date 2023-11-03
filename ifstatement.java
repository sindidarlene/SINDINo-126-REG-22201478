public class ifstatement { 
        public static void main(String args[]){
            int basketballscore = 100;
    if (basketballscore <50){
        System.out.println("losers");
    }        
    else if(basketballscore>=50 && basketballscore<=60){
        System.out.println("division5");
    }
    else if(basketballscore>=60 && basketballscore<=70){
        System.out.println("division4");
    }
     else if(basketballscore>=70 && basketballscore<=80){
        System.out.println("division3");       
    }  
    else if(basketballscore>=80 && basketballscore<=90){
        System.out.println("division2");    
    }
  else if(basketballscore>=90 && basketballscore<=100){
        System.out.println("division1");    
    } else{
        System.out.println("winners");
    }   
}
}