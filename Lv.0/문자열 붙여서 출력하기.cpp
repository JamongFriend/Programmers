#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main(void) {
    string str1, str2;
    cin >> str1 >> str2;
    str1.erase(remove(str1.begin(), str1.end(), ' '), str1.end());
    str2.erase(remove(str2.begin(), str2.end(), ' '), str2.end());
    cout << str1 << str2 << endl;
    return 0;
}