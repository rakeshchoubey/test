@('4.0', '4.5.2', '4.6.2', '4.7.2') `
    | %{ `
         Invoke-WebRequest -UseBasicParsing https://dotnetbinaries.blob.core.windows.net/referenceassemblies/v${_}.zip -OutFile referenceassemblies.zip; `
         Expand-Archive -Force referenceassemblies.zip -DestinationPath "${Env:ProgramFiles(x86)}\Reference Assemblies\Microsoft\Framework\.NETFramework\"; `
         Remove-Item -Force referenceassemblies.zip; `
     }