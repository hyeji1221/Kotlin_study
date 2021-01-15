package chap05.section6.association

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patienList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Kildong")
    doc1.patienList(patient1)
    patient1.doctorList(doc1)
}