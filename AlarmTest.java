public class AlarmTest {
  //idk what to approach in this
  public static void main(String[] args) {
    AlarmClock clock = new AlarmClock(7, 29, 55);
    clock.setAlarm(7, 30);

    System.out.println("Use Ctrl+C to quit...");
    clock.run();
  }
}