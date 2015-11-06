import acm.graphics.*;
import acm.program.GraphicsProgram;


public class Ejercicio1 extends GraphicsProgram {
	
	private static final int ANCHO_LADRILLO= 30;
    private static final int ALTO_LADRILLO = 12;
    private static final int LADRILLOS_BASE =14;
    private static final int ANCHO_PANT = 800;
    private static final int ALTO_PANT =600;

    public void init(){
            setSize(ANCHO_PANT,ALTO_PANT);
    }

    public void run(){


            //en el siguiente for lo que hemos echo es que se pongan 14 ladrillos y se separen por el ANCHO_LADRILLO



            //              for (int j=0; j < LADRILLOS_BASE ; j++){
            //
            //                      for (int i=0; i < LADRILLOS_BASE -j ; i++){
            //
            //                              GRect ladrillo = new GRect (ANCHO_LADRILLO ,ALTO_LADRILLO );
            //
            //                              ladrillo.setLocation( -1*(i*ANCHO_LADRILLO + ANCHO_LADRILLO*j/2   )+400+ANCHO_LADRILLO*6, -1*(j *ALTO_LADRILLO)+300+ALTO_LADRILLO*12);
            //                              add(ladrillo);
            //                      }
            //
            //              }
            for (int j=0; j < LADRILLOS_BASE ; j++){
            for (int i=0; i < LADRILLOS_BASE -j ; i++){
                    GRect ladrillo = new GRect (ANCHO_LADRILLO ,ALTO_LADRILLO );
                    ladrillo.setLocation((-8 + (ANCHO_PANT/2)-(ANCHO_LADRILLO * LADRILLOS_BASE/2))+(i*ANCHO_LADRILLO + ANCHO_LADRILLO*j/2   ),(-j *ALTO_LADRILLO)+(ALTO_PANT/2 + ALTO_LADRILLO*LADRILLOS_BASE));
                    add(ladrillo);
                    pause(10);

            }



    }
    }

}

