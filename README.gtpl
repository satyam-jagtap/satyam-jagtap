
<a href="https://www.twitch.tv/satyam-jagtap" target="_blank" rel="noreferrer"><img
src="https://img.shields.io/twitch/status/satyam-jagtap?logo=twitchsx&style=for-the-badge&color=0891b2&labelColor=1c1917&label=TWITCH+STATUS" /></a>


### GitHub Stats

<p align="left"><img src="https://raw.githubusercontent.com/satyam-jagtap/satyam-jagtap/main/github-metrics.svg" /></p>

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
### 📰 Recent Blog Posts
{{ range rss "https://christitus.com/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Youtube   : <https://youtube.com/c/satyam-jagtap>
  - Twitch    : <https://twitch.tv/satyam-jagtap>
  - Twitter   : <https://twitter.com/satyam-jagtap>
  - Website   : <https://christitus.com>
  - Web Store : <https://cttstore.com>
