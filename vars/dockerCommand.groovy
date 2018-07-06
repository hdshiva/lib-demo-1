def call(args) {
      assert args != null
      return sh(script: "docker ${args}", returnStdout: true)
  }
