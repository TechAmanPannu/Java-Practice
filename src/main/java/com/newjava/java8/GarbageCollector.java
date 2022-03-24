package com.newjava.java8;

/**
 * @author Amandeep Singh on 3/24/22/03/2022
 */
public class GarbageCollector {


    /// Introduction

    /*
    * It is an Automatic process
    * Looks in heap Memory for the objects which are in use or not, and deleting the unused objects.
    *
    *
    * */

    /// Important Concepts

    /*
    *  1. Unreachable Objects :  e.g i = null and i is no longer reachable
    *
    *  2. Eligibility for garbage collection :
    *       a. By default null value references are eligible for removal
    *       b. Re-assigning the reference variable
    *       c. An Object reacted inside the method
    *       4. Island of Isolation : when object1 reference to object2 and object2 reference to object1 but they are not reference to any other object
    *
    *  3.  Ways for requesting JVM to run Garbage Collector :
    *       1. Once object become null it may not destroy.
    *       2. When JVM run Garbage Collector program it start find null object start removing
    *       3. We cannot expect when JVM will start the Garbage Collector
    *       4. We can also request JVM to start GC in two ways;
    *               a. Using System.gc() method :
    *               b. Using Runtime.getRuntime().gc() method :
    *          But still there is no guarantee GC will start
    *          Both effectively equal calls

    *  4. Finalization :
    *       a. Before deleting object GC call finalize() method. which is available in Object class
    *       b. It is never invoke more than once for any object
    *
    *   5. Garbage Collection Pause :
    *           1. Overall process time to cleanup memory when jvm invokes gc.
    *           2. Consumer can face process delay if gc pause takes more time.
    *
    *   6. Tips to Reduce Garbage Collection Pause :
    *       a. Reduce Object creation rate
    *       b. Choice of GC algorithm : If not good in GC, use GC1 algo, it has auto-tuning capabilities, we can even set GC pause time goal using -XX:MaxGCPauseMillis=200
    *       c. Not keeping large heap size, which internally reduces number of object creation and when gc invokes it takes less time to cleanup and hence pause would be less.
    *   7. GC Algorithms
    *           1. GC1
    *
    * */

}
