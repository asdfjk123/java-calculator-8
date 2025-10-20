package calculator;

import java.util.List;

public class Caculator {

  // 최종 확정된 문자열 계산
  public int calculate(List<String> ops) {
    int i = 0;
    while (i < ops.size()) {
      i += Integer.parseInt(ops.get(i));
    }
    return i;
  }
}
