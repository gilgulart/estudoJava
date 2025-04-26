public class Tenminutes {
    public static void main(String[] args){
        int minutes, seconds;
        for (minutes = 10; minutes >= 0; minutes--){
        for (seconds = 59; seconds >= 0; seconds--){
    String formattedSeconds = String.format("%02d", seconds);
        System.out.println(minutes + ":" + formattedSeconds);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        }
        }
        System.out.println("tempo esgotado!");
    }
}
