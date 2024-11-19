public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int hoursPlus = minutesToAdd/60;
        int minutesPlus = minutesToAdd%60;

        hours = (hours + hoursPlus)%24;
        minutes = minutes + (minutesPlus%60);

        if (minutes>=60) {
            minutes = minutes-60;
            hours++;
        }
        if (hours == 24) {
            hours = 00;
        }


        String formattedHours = Integer.toString(hours);
        String formattedMinutes = Integer.toString(minutes);


        if (minutes<10) {
            formattedMinutes = "0" + formattedMinutes;    
        }

        if (hours<10) {
            formattedHours = "0" + formattedHours;
        }

        System.out.println(formattedHours+":"+formattedMinutes);

    }
}
