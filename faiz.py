import datetime

# Sample data structure to store bookings
bookings = []

class Booking:
    def __init__(self, user_name, service_provider, date_time):
        self.user_name = user_name
        self.service_provider = service_provider
        self.date_time = date_time

def book_appointment():
    user_name = input("Enter your name: ")
    service_provider = input("Enter the service provider's name: ")
    date_str = input("Enter the appointment date and time (YYYY-MM-DD HH:MM): ")

    try:
        date_time = datetime.datetime.strptime(date_str, "%Y-%m-%d %H:%M")
        new_booking = Booking(user_name, service_provider, date_time)
        bookings.append(new_booking)
        print("Appointment booked successfully!")
    except ValueError:
        print("Invalid date and time format. Please use YYYY-MM-DD HH:MM.")

def list_bookings():
    if not bookings:
        print("No appointments booked yet.")
    else:
        print("Booked Appointments:")
        for i, booking in enumerate(bookings, start=1):
            print(f"{i}. User: {booking.user_name}, Service Provider: {booking.service_provider}, Date and Time: {booking.date_time}")

def main():
    while True:
        print("\nBooking System Menu:")
        print("1. Book an Appointment")
        print("2. List Booked Appointments")
        print("3. Exit")
        choice = input("Enter your choice: ")

        if choice == "1":
            book_appointment()
        elif choice == "2":
            list_bookings()
        elif choice == "3":
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
