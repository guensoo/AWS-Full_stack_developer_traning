package access;

import ex05_inheritance.Parent;

public class NotChild {
   void accessTest() {
      Parent p2 = new Parent();
      super.accessProtected();
      p2.accessProtected();
      //자식클래스가 아니기 때문에 접근이 불가능하다.
   }
}