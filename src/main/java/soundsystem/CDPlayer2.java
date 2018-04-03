package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer2 implements MediaPlayer {
  
  @Autowired
  @Qualifier("sgtPeppers")
  private CompactDisc cd;
  
  public CDPlayer2() {
    System.out.println("CDPlayer2 생성자!!!");
  }
  
  public void play() {
    cd.play();
  }

}
