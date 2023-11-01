import  java.io.*;
  /*
  CSCE 111
  base file by Robert Lightfoot
  Writing file example, in a method.
  Creating ppm File output.ppm
  view at http://web.eecs.utk.edu/~smarz1/pgmview/ or
  other PPM viewers
  Fall 2021
  */
class picPix  {
  public static void main(String[] args) {
    if (args.length == 0 ) {
      System.out.println("Usage: java pic nnn, where nnn is an integer between 300 and 600 ");
      System.exit(0);
    }//set the size of your square.
    //You can use user input, but validate that it is between 300 and 600.
    int mySize = Integer.parseInt(args[0]);
    //build 3 parallel arrays. You can rename them if you want.
    // int[][] red = new int[mySize][mySize];
    // int[][] green = new int[mySize][mySize];
    // int[][] blue = new int[mySize][mySize];

    Pixel[][] pixels = new Pixel[mySize][mySize] ;
    //and idea for createing colors  - Maroon
    int maroonR = 88;
    int maroonG = 0;
    int maroonB = 0;
    // and here is White.
    int whiteR = 255;
    int whiteG = 255;
    int whiteB = 255;

    // your code here
    // Fill the arrays using loops, equations,
    // user input for color choices (validate data if you do this)
    // or use methods to do this.
    // Hint, fill with one color, then overwrite certian areas with
    // another color.

    // base layer of maroon and white slanted across square
    for (int i = 0; i < mySize ; i++) {
      for (int j = 0; j < mySize ; j++) {
        if (i > j) {
          // red[i][j] = maroonR;
          // green[i][j] = maroonG;
          // blue[i][j] = maroonB;

          pixels[i][j] = new Pixel(maroonR, maroonG, maroonB);
        }else {
          // red[i][j] = whiteR;
          // green[i][j] = whiteG;
          // blue[i][j] = whiteB;
        
          pixels[i][j] = new Pixel(whiteR, whiteG, whiteB);

        }

      }//end for j
    }//end for i

    //blue circle in the middle (or whereever you set midpoint)
    //you will want an xMidPoint and yMidPoint if you don't want to be able to
    //place the circle anywhere.
    int midPoint = mySize/2;
    int r = midPoint/2;
    for (int i = (midPoint - r + 1); i < (mySize - midPoint + r + 1); i++) {
      for (int j = (midPoint - r + 1); j <(mySize - midPoint + r + 1) ; j++) {
        //next check if the distance of the point is further away than the
        //radius is, change if not.
        if (((Math.pow(j - midPoint, 2)) + (Math.pow(i - midPoint, 2))
          <= Math.pow(r, 2))) {
          // red[i][j] = 12;
          // green[i][j] = 120;
          // blue[i][j] = 255;

          pixels[i][j].setPixel(12, 120, 255);
        }

      }//end for j
    }//end for i
    // when arrays are filled, send them to writeFile
    writeFile(pixels, "C");

    // convert your image to gray scale (Black and white)

    //your code here
    for (int i = 0; i < mySize ; i++) {
      for (int j = 0; j < mySize ; j++) {
          // int gray = (int)(red[i][j] * 0.3) + (int)(green[i][j] * 0.59) +
          //   (int)(blue[i][j] * 0.11);
          // red[i][j] = gray;
          // green[i][j] = gray;
          // blue[i][j] = gray;
          pixels[i][j].setGray();

      }//end for j
    }//end for i

    // when arrays are filled, send them to writeFile
    writeFile(pixels, "G");
  }//end main


/**
 * Given 3 parallel arrays, Writefile will write an output
 * file in PPM format that can be viewed with a ppm viewer.
 * All 3 arrays must be the same size.
 * @param r 2 dimentional array of integers from 0 - 255
 * @param g 2 dimentional array of integers from 0 - 255
 * @param b 2 dimentional array of integers from 0 - 255
 * you do not need to edit this method
 */
  		public static void writeFile(Pixel[][] p, String outputType) {
        //the output will be based on the array size sent.
        int size = r.length;
        //pixel will store the color to be output to the file.
        String pixel;
        try {
          //open a file in the current directory. will overwrite
          //previous versions.
          String fileName = "output"+outputType+".ppm";
          File output = new File(fileName);
          FileWriter fw = new FileWriter(output);
          //create the header of PPM files.
          fw.write("P3\n"+ size + " " + size +"\n255\n");
          //write out all pixels from the RGB arrays.
          for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
              pixel = String.format("%d %d %d ",p[i][j].getRed, p[i][j].getGreen, p[i][j].getBlue());
              fw.write(pixel);
            }//end for j
          }//end for i
          fw.close();
        } catch(Exception e) {
          System.out.println("Error writing file.");
        }//end try catch

  	} // end writeFile2
  }  // end class
