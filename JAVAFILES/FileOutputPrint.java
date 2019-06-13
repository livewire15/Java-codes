 PrintStream o = new PrintStream(new File("A.txt"));
 
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
 
        // Assign o to output stream
        System.setOut(o);
        System.out.println("This will be written to the text file");