public static Singleton getInstance(){
     if(_INSTANCE == null){
         synchronized(Singleton.class){
         //double checked locking - because second check of Singleton instance with lock
                if(_INSTANCE == null){
                    _INSTANCE = new Singleton();
                }
            }
         }
     return _INSTANCE;
}

/* multi-thread singleton design */
