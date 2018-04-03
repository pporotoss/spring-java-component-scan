package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

//  스프링 4.3 부터는 생성자가 하나일 경우에 @Autowired 생략해도 주입해준다.
  @Autowired
  public CDPlayer(@Qualifier("myDisc") CompactDisc cd) {
    System.out.println("CDPlayer 생성자!!");
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
