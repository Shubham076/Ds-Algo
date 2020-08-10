#include <iostream>
#include <string>
using namespace std;


// returns the index of day of first january(0=6)
int getDay(int year)
{
   int day= (((year - 1) * 365) + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400) + 1) % 7;

    return day;
}

string monthName(int monthNo)
{
    string month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    return month[monthNo - 1];
}

// tells the numbers of days in a month
int noOfDays(int monthNo, int year)
{
    int no_of_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
    {
        no_of_days[1] = 29;
    }
    return no_of_days[monthNo - 1];
}

void printCalender( int year)
{

    int startDay = getDay(year);
    int weekDay = 0;

    cout << "------------ " + to_string(year) + "---------------" << endl;

    for (int i = 1; i <= 12; i++)
    {
        string monthname = monthName(i);

        cout << "\n---------------" + monthname + "------------------" << endl;

        int days = noOfDays(i, year);

        cout << "  Sun  Mon  Tues  Wed  Thu  Fri  Sat" << endl;

        for ( weekDay = 0; weekDay < startDay; weekDay++)
        {
            cout << "     ";
        }

        for (int i = 1; i <= days; i++)
        {
            printf("%5d", i);
            if (++weekDay > 6)
            {
                cout << endl;
                weekDay = 0;
            }
            startDay = weekDay;
        }
        cout << endl;
    }
}



int main()
{
    cout << "Enter the Year:";
    int year;
    cin >> year;

    printCalender( year);
}
