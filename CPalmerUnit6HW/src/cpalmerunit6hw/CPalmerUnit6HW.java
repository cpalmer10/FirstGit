package cpalmerunit6hw;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class CPalmerUnit6HW {   
    
    private static CareTaker ct = new CareTaker(0);
    private static int life = 0; 
    private static String name;
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
        Calendar cal = Calendar.getInstance();
        
        
        int random;        
        int day = 0;  
               
        String ans;
        String[] computerName= new String[6];
            computerName[0] = "Rick Astley";
            computerName[1] = "Simon Cowell";
            computerName[2] = "Matt Green";
            computerName[3] = "Rebecca Black";
            computerName[4] = "Pikachu";
            computerName[5] = "Homer Simpson";
                                                   
        System.out.println("Welcome to the wonderful game of \"Life\"!");
        System.out.println("");
        System.out.println("\t!!! RULES !!!\n\t\t1.) Stay Alive\n\t\t2.) Don't Die\n\t!!! END OF RULES !!!");
      
        
        
        System.out.print("\nPlease enter your name: ");
        name = keyboard.nextLine();
        
        
                
        random = (int)((Math.random() * 5) + 1);
        System.out.println("\nHello, " + name + ". My name is " + computerName[random] + ", I will be your narrator!");
        
        do {
            
            ++day;
            System.out.println("Day " + day + ": Morning");
                System.out.println("BEEP! BEEP!! BEEP!!!");
                System.out.print("Your alarm is rining... Do you want to press (SN)ooze, get up to (S)hower, or get up to eat (B)reakfast?: ");
                ans = keyboard.nextLine().toUpperCase();
                switch(ans) {
                    case "SN":                                               
                        snooze(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                        System.out.println("\nLife: " + life);
                        break;
                    case "S":                        
                        shower(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                        System.out.println("\nLife: " + life);
                        break;
                    case "B":                                               
                        breakfast(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                        System.out.println("\nLife: " + life);
                        break;
                    default:                        
                        snooze(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                       
                }
            System.out.println("\nDay " + day + ": Afternoon");
                    // deterimine if weekday
                if (!(day % 6 == 0) || (!(day % 7 == 0))) {
                    System.out.print("You have a break between classes right now... Do you want to eat (L)unch, do (H)omework, or (S)kip class?: ");
                    ans = keyboard.nextLine().toUpperCase();
                    switch(ans) {
                        case "L":                        
                            lunch(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                            System.out.println("\nLife: " + life);
                            break;
                        case "H":                        
                            homework(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                            System.out.println("\nLife: " + life);
                            break;
                        case "S":                        
                            skip(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                           
                            System.out.println("\nLife: " + life);
                            break;
                        default:                        
                            lunch(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                            System.out.println("\nLife: " + life);
                        }    
                } else {
                    System.out.println("No school today... Would you like to go (O)utside, stay (I)nside, or go back to (B)ed?: ");
                    ans = keyboard.nextLine().toUpperCase();
                    switch(ans) {
                        case "L":                        
                            outside(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                            System.out.println("\nLife: " + life);                            
                            break;
                        case "H":                        
                            inside(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                           
                            System.out.println("\nLife: " + life);
                            break;
                        case "S":                        
                            bed(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                            
                            System.out.println("\nLife: " + life);
                            break;
                        default:                        
                            outside(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                            System.out.println("\nLife: " + life);
                        }  
                }
                                                    
            System.out.println("\nDay " + day + ": Evening");
                System.out.println("You look at the clock... The time reads " + sdf.format(cal.getTime()));
                if ((day % 2) == 0) {
                    System.out.println("You work today... Do you want to get (R)eady, (C)all in, or play (G)ames?: ");
                    ans = keyboard.nextLine().toUpperCase();
                    switch(ans) {
                    case "R":                       
                        ready(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                        System.out.println("\nLife: " + life);                        
                        break;
                    case "C":                       
                        call(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                        
                        System.out.println("\nLife: " + life);
                        break;
                    case "G":                        
                        games(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                       
                        System.out.println("\nLife: " + life);
                        break;
                    default:                                             
                        ready(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                        System.out.println("\nLife: " + life);
                    }        
                } else { 
                    System.out.println("You do not work today... Do you want to work on (S)chool, (W)ork, or watch (T)elevision?: ");
                    ans = keyboard.nextLine().toUpperCase();
                    switch(ans) {
                    case "S":                        
                        school(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                        
                        System.out.println("\nLife: " + life);
                        break;
                    case "W":                       
                        work(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                        
                        System.out.println("\nLife: " + life);
                        break;
                    case "T":                        
                        television(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();                       
                        System.out.println("\nLife: " + life);
                        break;
                    default:                        
                        school(); offDay(); incCold(); birdFlu(); rested(); wellRested(); overlyRested(); feelingSick(); bedRidden(); mightDie(); dead();
                        System.out.println("\nLife: " + life);
                    }
                }
                                                      
        }while(life <= 6 || life >= -6);
   
    }
public static void snooze() {
    life += ct.getSnooze();
}   
public static void shower() {
    life += ct.getShower();
}
public static void breakfast() {
    life += ct.getBreakfast();
}
public static void lunch() {
   life += ct.getLunch();
}
public static void homework() {
   life += ct.getHomework();
}
public static void skip() {
   life += ct.getSkip();
}
public static void ready() {
   life += ct.getReady();
}
public static void call() {
   life += ct.getCall();
}
public static void games() {
   life += ct.getGames();
}
public static void school() {
   life += ct.getSchool();
}
public static void work() {
   life += ct.getWork();
}
public static void television() {
   life += ct.getTelevision();
}
public static void outside() {
   life += ct.getOutside();
}
public static void inside() {
   life += ct.getInside();
}
public static void bed() {
   life += ct.getBed();
}
// life = -1
public static void offDay() {
    if (life == -1) {
        System.out.println(name + " is having an off day.");
    }
}
// life = -2
public static void incCold() {
    if (life == -2) {
         System.out.println(name + " is showing symptoms of a cold.");
    }
}
// life = -3
public static void birdFlu() {
    if (life == -3) {
         System.out.println(name + "'s symptoms are getting worse.");
    }
}
// life = 1
public static void rested() {
    if (life == 1) {
             System.out.println(name + " is feeling rested.");
        }
}
// life = 2
public static void wellRested() {
    if (life == 2) {
         System.out.println(name + " is feeling well rested.");
    }
}
// life = 3
public static void overlyRested() {
    if (life == 3) {
         System.out.println(name + " is feeling overly rested.");
    }
}
// 4 || -4
public static void feelingSick() {
    if (life == 4 || life == -4) {
         System.out.println(name + " might have to see a doctor...soon.");
    }
}
// 5 || -5
public static void bedRidden() {
    if (life == 5 || life == -5) {
         System.out.println(name + " is bedridden.");
    }
}
// 6 || -6
public static void mightDie() {
    if (life == 6 || life == -6) {
         System.out.println(name + " is very very sick... should have seen that doctor!");
    }
}
// > 6 or < -6
public static void dead() {
    if (life > 6 || life < -6) {
        System.out.println("Whoops... " + name + " has passed away. RIP.");
    }
}

}

