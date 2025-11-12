import java.util.Scanner;
public class JavaKoProject {
    
    public static void main(String[] args) {      
     Scanner in= new Scanner (System.in); 
      
   System.out.println("Enter words: ");
             
   String wordKo= in.nextLine();     
      
    String [][]Dami = processLine(wordKo);  
    printSummary(Dami);
    
    
    }
 
    
 public static String[][] processLine(String NilagayNya){
  String Aito="A: ";String Eito="E: ";String Iito="I: ";String Oito="O: ";String Uito="U: "; 
  int lettera=0,lettere=0,letteri=0,lettero=0,letteru=0;
  int letterA=0,letterE=0,letterI=0,letterO=0,letterU=0;
  for (int i=0 ; i<NilagayNya.length(); i++){
         char ch = NilagayNya.charAt(i);
         
         if(ch == 'a'){
         lettera++;                        
 }         
         else if(ch == 'e'){        
         lettere++;
 }        
         else if(ch == 'i'){         
         letteri++;
 }        
         else if(ch == 'o'){        
         lettero++;
 }        
         else if(ch == 'u'){        
         letteru++;
 }                
         else if(ch == 'A'){       
         letterA++;
}        
         else if(ch == 'E'){       
         letterE++;
}       
         else if(ch == 'I'){        
         letterI++;
}        
         else if(ch == 'O'){         
         letterO++;
}         
         else if(ch == 'U'){        
         letterU++;
}
} 

String aletter=Integer.toString(lettera);    
String descript=" lowercase"; String completea= Aito.concat(aletter.concat(descript));
  
String eletter=Integer.toString(lettere);    
String completee= Eito.concat(eletter.concat(descript)); 

String iletter=Integer.toString(letteri);    
String completei= Iito.concat(iletter.concat(descript));

String oletter=Integer.toString(lettero);    
String completeo= Oito.concat(oletter.concat(descript));

String uletter=Integer.toString(letteru);    
String completeu= Uito.concat(uletter.concat(descript));

String Aletter=Integer.toString(letterA);    
String descript2=" uppercase";String completeA= Aletter.concat(descript2);

String Eletter=Integer.toString(letterE);    
String completeE= Eletter.concat(descript2);

String Iletter=Integer.toString(letterI);    
String completeI= Iletter.concat(descript2);

String Oletter=Integer.toString(letterO);    
String completeO= Oletter.concat(descript2);

String Uletter=Integer.toString(letterU);    
String completeU= Uletter.concat(descript2);

int totalA= lettera +letterA; int totalE= lettere+letterE; int totalI= letteri+letterI;
int totalO= lettero+letterO; int totalU= letteru+letterU;

String descript3=" total";
String Atotal=Integer.toString(totalA);
String Ailan= Atotal.concat(descript3);

String Etotal=Integer.toString(totalE);
String Eilan= Etotal.concat(descript3);

String Itotal=Integer.toString(totalI);
String Iilan= Itotal.concat(descript3);

String Ototal=Integer.toString(totalO);
String Oilan= Ototal.concat(descript3);

String Utotal=Integer.toString(totalU);
String Uilan= Utotal.concat(descript3);


String [][]overAll={{completea, completeA, Ailan },
                    {completee, completeE, Eilan},
                    {completei, completeI, Iilan },
                    {completeo, completeO, Oilan },
                    {completeu, completeU, Uilan }
};

 
  
  
  return overAll;
}   
    
  
 public static String printSummary(String [][]TagaSalo){
    System.out.println(TagaSalo[0][0]+", "+TagaSalo[0][1]+", "+TagaSalo[0][2]);
    System.out.println(TagaSalo[1][0]+", "+TagaSalo[1][1]+", "+TagaSalo[1][2]); 
    System.out.println(TagaSalo[2][0]+", "+TagaSalo[2][1]+", "+TagaSalo[2][2]);
    System.out.println(TagaSalo[3][0]+", "+TagaSalo[3][1]+", "+TagaSalo[3][2]);
    System.out.println(TagaSalo[4][0]+", "+TagaSalo[4][1]+", "+TagaSalo[4][2]);
 return "a";
} 
}