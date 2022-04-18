#include <string>
#include <vector>
#include <map>
#include <iostream>

using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
    map<string, string> id_name;

    for (auto r : record) {
        int blank = 0;
        int first = 0;
        int second = 0;

        for (int i = 0; i < r.length(); i++) {
            if (r[i] == ' ') {
                blank++;
                if (blank == 1) {
                    first = i + 1;
                }
                if (blank == 2) {
                    second = i + 1;
                }
            }
        }
        if (r.substr(0, first - 1) != "Leave") {
            int id_l = second - first;
            int name_l = r.length() - second;
            string id = r.substr(first, id_l - 1);
            string name = r.substr(second, name_l);
            id_name[id] = name;
        }
    }

    for (auto r : record) {
        int blank = 0;
        int first = 0;
        int second = 0;
        string tmp = "";

        for (int i = 0; i < r.length(); i++) {
            if (r[i] == ' ') {
                blank++;
                if (blank == 1) {
                    first = i + 1;
                }
                if (blank == 2) {
                    second = i + 1;
                }
            }
        }
        if (r.substr(0, first - 1) == "Enter") {
            int id_l = second - first;
            string id = r.substr(first, id_l - 1);
            auto name = id_name.find(id);
            if (name != id_name.end()) {
                tmp += name->second;
            }
            tmp += "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
            answer.push_back(tmp);
        }

        if (r.substr(0, first - 1) == "Leave") {
            int id_l = r.length() - first;
            string id = r.substr(first, id_l);
            auto name = id_name.find(id);
            if (name != id_name.end()) {
                tmp += name->second;
            }
            tmp += "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
            answer.push_back(tmp);
        }
    }

    return answer;
}

int main() {
    vector<string> record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan" };
    vector<string> answer;
    answer = solution(record);

    for (auto a : answer) {
        cout << a << endl;
    }
}