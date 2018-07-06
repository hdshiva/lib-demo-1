def call() {
    echo "Inside the ReleasedVersionNum()"
    (readFile('pom.xml') =~ '<version>(.+)-SNAPSHOT</version>')[0][1]
}
