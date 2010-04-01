!SLIDE
# DSL for web testing *our* app

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected",
           (page:PageSpecification) => {

        page.requiresLogin
        page.shouldContain(
          "Hello Dave").inElement("h1")
      })
    }

!SLIDE
# Why not the ultimate DSL?

    @@@ Scala
    def someTest = {
      goto http://localhost 
        and login as "dave@blah.com"
        with password "foobar69"
      should be on page "protected"
      should see <h1>Hello Dave</h1>
        and link:"logout"
    }

!SLIDE
# Why not the ultimate DSL?

    @@@ Scala
    def someTest = {
      goto http://localhost  // uhh...
        and login as "dave@blah.com" // ok..
        with password "foobar69" // umm...
      // what's calling what here?
      should be on page "protected"
      // XML?!  wtf?!
      should see <h1>Hello Dave</h1>
        and link:"logout" // colon?!
    }

!SLIDE 
# Smooth the learning curve

!SLIDE bullets incremental
# Ground Rules for DSL
* Consistent syntax
* No new operators
* Minimize new concepts

!SLIDE small
# How many new concepts?

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected", // *1*
           (page:PageSpecification) => { // *2,3*

        page.requiresLogin
        page.shouldContain(
          "Hello Dave").inElement("h1")
      })
    }

!SLIDE bullets incremental
# How many new concepts?

* *[1].* Scala syntax - this is constructor code
* *[2].* types come after a <code>:</code>
* *[3].* Functions/closures - <code>(page) => {</code> is a function literal
 
!SLIDE bullets incremental
# Reinforce familiar concepts

* Dots - x.y == method call - easy to grok
* <code>page</code> - has an obvious type, we can look up its methods
* Braces - they define a scope

!SLIDE small bullets incremental
# Ground Rules for Implementation
* Had a weekend to build it
* Mixins
* Case Classes
* Collections
* All fair game

!SLIDE small bullets incremental
# Ground Rules for Implementation
* No implicits
* Imperative/OO design
* Minimze type parameters
* Lots of scaladoc
* "How" and "What" Comments
* No f!%$%ing underscore :)

!SLIDE  bullets incremental
# Couldn't this have been done in Java?
* Certainly, but...

!SLIDE bullets incremental
# DSL implementation would've taken too long in Java
* Scala's good at wrapping APIs
* Mixins are better for re-use than single inheritance
* Collections + Closures simplify many things

