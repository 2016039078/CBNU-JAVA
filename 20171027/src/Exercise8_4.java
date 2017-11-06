
public class Exercise8_4 {
/*[8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
void method() throws InvalidNumberException, NotANumberException {}
class NumberException extends RuntimeException {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}
a. try {method();} catch(Exception e) {}
b. try {method();} catch(NumberException e) {} catch(Exception e) {}
c. try {method();} catch(Exception e) {} catch(NumberException e) {}
d. try {method();} catch(InvalidNumberException e) {
 } catch(NotANumberException e) {}
e. try {method();} catch(NumberException e) {}
f. try {method();} catch(RuntimeException e) {}
정답 : c
try블럭 내에서 예외가 발생하면, catch 블럭 중에서 예외를 처리 할 수있는 것을 차례대로 찾아 내려간다. 
이때 발생한 예외의 ㅈㅇ류와 일치하는 블럭이있으면 그 블럭문장을 수행하고 try-catch문을 빠져나간다. 일치하는
블럭이 없을 떄에는 예외처리가 되지 않는다.*/
}
