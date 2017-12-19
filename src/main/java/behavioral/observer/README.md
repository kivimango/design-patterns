# Observer
The **Subject** (or the **Observable**) maintains a list of dependents, called the **observers**, and notifies them automatically of any state changes (usually calling a method).
Observers can subscribe or unsubscribe to an Observable.

In this example the Product is the Subject, extends the Observable class.
The Customer is an Observer, implementing the Obsersver interface.

## What problems can solve ?
* A one-to-many dependency between objects should be defined without making the objects tightly coupled.
* It should be ensured that when one object changes state an open-ended number of dependent objects are updated automatically.
* It should be possible that one object can notify an open-ended number of other objects.

## Real-life examples
* Handling a button press action in GUI's (Java Swing or JavaFx).

## Flaws
The observer pattern can cause memory leaks, known as the lapsed listener problem, because in basic implementation it requires both explicit registration and explicit deregistration, as in the dispose pattern, because the subject holds strong references to the observers, keeping them alive. This can be prevented by the subject holding weak references to the observers.