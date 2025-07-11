<p align="center">
    <img src="https://raw.githubusercontent.com/adamNewell/adamNewell/main/public/logos/adamNewell-485px-github.png" />
</p>

### Socials

<p align="left"> 
    <a href="https://www.github.com/adamNewell" target="_blank" rel="noreferrer"> 
        <picture> 
            <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github-dark.svg" /> 
            <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" /> 
            <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" width="32" height="32" />
        </picture>
    </a>
    <a href="https://www.linkedin.com/in/adamdnewell/" target="_blank" rel="noreferrer"> 
        <picture> 
            <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin-dark.svg" /> 
            <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin.svg" /> 
            <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin.svg" width="32" height="32" />
        </picture>
    </a>
    <a href="https://medium.com/@AdamDNewell" target="_blank" rel="noreferrer"> 
        <picture> 
            <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/medium-dark.svg" /> 
            <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/medium.svg" /> 
            <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/medium.svg" width="32" height="32" />
        </picture>
    </a>
    <a href="https://leetcode.com/u/adamNewell/" target="_blank" rel="noreferrer">
        <picture>
            <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/adamNewell/adamNewell/main/public/icons/socials/leetcode-dark.svg" />
            <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/adamNewell/adamNewell/main/public/icons/socials/leetcode.svg" />
            <img src="https://raw.githubusercontent.com/adamNewell/adamNewell/main/public/icons/socials/leetcode.svg" width="32" height="32" />
        </picture>
</p>


### GitHub Stats

<p align="center"><img src="https://raw.githubusercontent.com/adamNewell/adamNewell/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}