package com.newjava.java8;

/**
 * @author Amandeep Singh on 3/24/22/03/2022
 */
public class MemoryOptimizations {

    // PermGen is gone
            //// 1. PermGen was part of heap till java8, now it is not longer part


    /// Advantages :

    /*
    1. Fixed-size at startup: difficult to tune.
    2. Internal Hotspot types were Java objects: Could move with full GC, opaque, not strongly typed and hard to debug, needed metadata.
    3. Simplify full collections: Added Special iterators for metadata for each collector.
    4. Instead of GC pause, now deallocate class data concurrently.
    5. Enable future improvements that were limited by PermGen.

    */


    // Metaspace came
            ///// 2. It is operating system specific native memory, It means not your application but entire server can come down if lot of objects created
            ///// 3. It will get decreased and increased based on the usage, so we will not see outOfMemory error
            ////  4. we can resize it using  -XX:MaxMetaspaceSize, but needs to very cautious,
            ///  5. default size is dynamic it can resize based on requirement

    /// Advantages :
    /*
    *
    *
    *  1. Take advantage of Java Specification property: Classes and associated metadata lifetimes match class loaders.
       2.  Per loader storage area: Metaspace
       3. Linear allocation only.
       4. No individual reclamation (except for Redefine Classes and class loading failure)
       5. No GC scan or compaction.
       6. No relocation for metaspace objects.
    *
    * */


}
