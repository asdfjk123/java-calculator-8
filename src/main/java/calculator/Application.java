package calculator;


public class Application {

  public static void main(String[] args) {
    // TODO: 프로그램 구현
    System.out.println("덧셈할 문자열을 입력해 주세요.");
    String input = camp.nextstep.edu.missionutils.Console.readLine();
    String processedInput = input.replace("\\n", "\n");

    Calculator calculator = new Calculator();
    int result = calculator.add(processedInput);

    System.out.println("결과 : " + result);
  }
}
