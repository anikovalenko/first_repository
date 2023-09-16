package org.example.coding_principles.silgleton;

public class ThreadsafeViaStatic {
    // the instance initialised in a static class which
    // means that it initialised before thread making.

    // is convenient to use for self-initializing instances, which doesn't need to take any data from main.
    // simplest static block is also allowed instead of static nested class (NEEDS TO BE CHECKED)

    private ThreadsafeViaStatic(){

    }

    ThreadsafeViaStatic getInstance(){
        return SingletonLoader.INSTANCE;
    }

    private static class SingletonLoader{
        static final ThreadsafeViaStatic INSTANCE = new ThreadsafeViaStatic();
    }
}
