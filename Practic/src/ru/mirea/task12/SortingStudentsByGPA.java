package Practic.src.ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSrBall() - o2.getSrBall();
    }

    public void quicksort(Student[] students, int low, int high) {
        if (students.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Student student = students[middle];
        int i = low, j = high;
        while (i <= j) {
            while (compare(students[i], student) > 0) {
                i++;
            }
            while (compare(students[j], student) < 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;

            }
            i++;
            j--;
            if (low < j) {
                quicksort(students, low, j);
            }
            if (high > i) {
                quicksort(students, i, high);
            }
        }

    }

    public void mergeSort(Student[] student, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = student[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = student[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(student, l, r, mid, n - mid);
    }

    private void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getSrBall() <= r[j].getSrBall()) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public void insertionSort(Student[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            Student key = new Student(a[i].getSrBall());
            int j = i-1;
            while ( (j >= 0) && ( a[j].getSrBall() > key.getSrBall())) {
                a [j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}