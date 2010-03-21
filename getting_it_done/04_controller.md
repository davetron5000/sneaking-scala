!SLIDE center
![Controller Focus](controller_focus.png)

!SLIDE smaller
# Application Endpoints

!SLIDE 
# DaveWeb5000 Controller

    @@@ Java
    public class TipController {

      public Object getTip() {
        String id = params.get("id");
        String format = params.get("format");
        Tip tip = tipService.find(id);
        return formatAs(format,tip);
      }
    }

!SLIDE 
# Scala-ized version

    @@@ Scala
    class TipController {

      def getTip = {
        val id = params("id");
        val format = params("format");
        val tip = tipService.find(id);
        formatAs(format,tip);
      }
    }


!SLIDE bullets incremental
# Low Risk, Low Value
* Endpoints are light/dumb
* "Power of Scala" has little to add
* Need framework with Scala in mind
