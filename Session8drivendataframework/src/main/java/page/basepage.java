package page;

import java.util.Random;

public class basepage {
public  static int randomgenerat() {
	Random rnd = new Random();
	int randomNum = rnd.nextInt(888);
	return randomNum;
}
}
