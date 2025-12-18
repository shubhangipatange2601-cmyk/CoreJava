package Threading;
class BookTheaterSeat {
     static int total_seats = 10;

  synchronized void bookSeats(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + "seats book successfully");
            total_seats = total_seats - seats;
            System.out.println("seats Left : " + total_seats);
        } else {
            System.out.println("Sorry seats cannot be booked...!!");
            System.out.println("seats Left : " + total_seats);
        }
    }

    public static class MovieBookApp extends Thread {
        static BookTheaterSeat b;
        int seats;

        @Override
        public void run() {
            super.run();
            b.bookSeats(seats);
        }


        public static void main(String[] args) {
            b = new BookTheaterSeat();
            MovieBookApp Mba1 = new MovieBookApp();
            Mba1.seats = 7;
            Mba1.start();

            MovieBookApp Mba2 = new MovieBookApp();
            Mba2.seats = 6;
            Mba2.start();

        }
    }
}