def call(args) {
      assert args != null
      echo "inside dockerCommand(args) method"
      return sh(script: "docker ${args}", returnStdout: true)
  }
