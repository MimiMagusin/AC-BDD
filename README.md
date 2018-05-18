# SOLID AND BDD

>In this class we will discuss BDD, using some of the SOLID principles as guidelines. The learning goals include:
>* Understand basic concepts of **OO Design and the SOLID Principles**
>* Understand the **concepts of BDD**
>* Get some **experience with BDD**
>* Practice programming and **design**

In this README you can find...

* A list of concepts
* The SOLID principles
* An explanation of ODD
* Intro to Kotlin/IJ
* Interesting sources

<hr/>

## Code Reviews
Code Reviews: Ask questions, make observations, help make the code better. Some Guidelines: 
* Review the **code**, not the coder
* Review **consistency**, **correctness** and **design**

## SOLID: Open Closed Principle

![SOLID](https://camo.githubusercontent.com/f957260233b36b58a6732cbc254febf4eabb1db6/687474703a2f2f77616c6c2d736b696c6c732e636f6d2f77702d636f6e74656e742f75706c6f6164732f323031332f31322f736f6c69642d4f4f505f77616c6c2d736b696c6c732e6a7067)

> **Open Closed Principle:** Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification

* You want to be able to use info/methods from parent classes, but you don't want your subclass to be able to change the parent class
* Original Meyer defenition:

![Open Closed Principle according to Meyer](https://image.slidesharecdn.com/softwareengineeringprinciplesmarcellothiry-151116193841-lva1-app6892/95/software-engineering-principles-marcello-thiry-55-638.jpg?cb=1447702857)

* In other words:

![In other words](https://image.slidesharecdn.com/obbjectorienteddesignsolidprinciples-12758863409589-phpapp02/95/object-oriented-design-solid-principles-24-728.jpg?cb=1279973465)

* It means that we should strive to write code that doesn’t have to be changed every time the requirements change: it should be reusable.


## Behaviour Driven Development (BDD)
### Background: Specification and Cod and "Business"
 * **BDD is a second-generation** (*TDD would be first*), **outside-in** (*rather than inside out*), **pull-based** (*You pull stuff out*), **multiple-stakeholder** (*multiple people have a say in the outcome*), **multiple-scale**(*not just for developers*), **high-automation**, **agile methodology**. It describes a cycle of interactions with well-defined outputs resulting in the delivery of working, tested software that matters.
 * Dan North: Programmers wanted to know where to start, what to test and what not to test, how much to test in one go, what to call their tests, and how to understand a why a tests fails. My response is behaviour-driven development.
### Use Cases, User Stories & Scenarios
* **User Cases**
> From [tynerblain.com](http://tynerblain.com/blog/2007/04/09/sample-use-case-example/):
>
>Some common elements in a use case template:
> * **Actor** – The person or people who will perform the steps of this use case.
> * **Preconditions** – A description of the relevant and non-trivial state(s) of the system prior to the use case starting.
> * **Normal course** – A description of the use case itself. This description can either be in narrative form, or a numbered list (1..N) of specific user steps. When a use case (such as “User approves/rejects customer requests”) has more than one way that a user can accomplish the needed steps, the most common way is shown here – only a single path is shown.
> * **Alternate courses** – Descriptions of alternatives to, or deviations from the normal course. For example, the most common course might be to view the oldest unaddressed customer requests. An alternate course may be to view the unaddressed requests from the largest customers.
> * **Exception courses** – Descriptions of what the user will experience when something goes wrong.
> * **Post-conditions** – Description of the affected portions of the state of the system after the use case has completed.
> * **Frequency of use** – An estimate of how often a particular use case will be exercised.
> * **Assumptions** – Any assumptions that are implicit in the definition of the use case.
* **User Stories**: 
> **As a** [A]
>
> **I want** [Y]
>
> **so that** [Z]
* **Scenarios**:
> **Given** some initial context (*Assign*)
>
> **When** an event occurs (*Act*)
>
> **then** ensure some outcomes (*Assert*)

### BDD Principles
According to [Dan North](https://dannorth.net/introducing-bdd/)
* Test method names should be sentences
* A simple sentence template keeps test methods focused
* An expressive test name is helpful when a test fails
* *Behaviour* is a more useful word thatn *test*
* Determine the next most important behaviour
* Requirements are behaviour, too
* BDD provides a *ubiquitours language* for analysis
* Acceptance criteria should be executable

### Techniques
* Frameworks and DSL's (xBehave, xSpec, Gherkin)

![Gherkin Example](https://qph.fs.quoracdn.net/main-qimg-28435b52a9e1943d397b6cc1c5745f4d)
*^This  is a Gherkin example^*

* A framework for collaboration and clarity

## Assignments
* Most assignments can be found in `./Kata/src/test/kotlin`
* We also build a project with multiple people. You can find the repo [here]().

## Kotlin
### Mutable vs Immutable lists
* Languages like Java have a **shared memory model**
![value vs reference types](https://i.stack.imgur.com/drQLh.jpg)
* Basic types are almost always **value types**, which are *immutable* (if you reassign them, a copy of the original value will be made, which is good for functional programming)
* Other types are **reference types**, they store the reference to the space in where the the values are memorized. These are *mutable* (and super fast, because you don't have to copy code each time you reassign something)
* **Lists in Kotlin are by default immutable**. If they would be mutable, they might react unpredictably when two methods try to access that memory space at the same time.
* Use immutable types if you use parallel processing **(paralellism)**, because there are no side effects
* [Check joelabrahmsson.com](http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/) for more info and an example.

## Q&A
### How can I extend legacy code?
* Set up boundaries, isolate your code (+ that that it is coupled to)
* Read the book Working with legacy code by M. Feathers
### What is good testing?
![BICEP testing](https://image.slidesharecdn.com/whyunittestingl-1274867650307-phpapp01/95/why-unit-testingl-22-728.jpg?cb=1274866550)
* A test that has one Assert and that is readable
* It is easier to define bad tests.


## Interesting Sources
* About working with legacy code: [Working Effectively With Legacy Code, M. Feathers](https://www.goodreads.com/book/show/44919.Working_Effectively_with_Legacy_Code)
* About the open Closed Principle: [JoelAbrahamsson.com](http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/)
* BDD: [Dan North - Introducing BDD](https://dannorth.net/introducing-bdd/)
* Use Cases: [TynerBlain.com](http://tynerblain.com/blog/2007/04/09/sample-use-case-example/)
* [Specification by Example](https://www.thoughtworks.com/insights/blog/specification-example)
* Refactoring: [Refactoring by Kent Beck](https://www.csie.ntu.edu.tw/~r95004/Refactoring_improving_the_design_of_existing_code.pdf)

