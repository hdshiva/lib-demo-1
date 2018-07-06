def call(args) {
      assert args != null
      echo "inside dockerCommand(args) method"
      echo "Args value: ${args}"
      sh "docker ${args}"
      //return sh(script: "docker ${args}", returnStdout: true)
  }
