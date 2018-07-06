def call(args) {
      //assert args != null
      echo "Args value: ${args}"
      echo "inside dockerCommand(args) method"
      //sh "docker ${args}"
      return sh(script: "docker ${args}", returnStdout: true)
  }
