[
 {
  "Name": "ACTIVE - HTTP Interaction", 
  "Active": false, 
  "Scanner": 1, 
  "Payloads": [
   "INJECTX.burpcollaborator.net", 
   "http://INJECTX.burpcollaborator.net", 
   "https://INJECTX.burpcollaborator.net", 
   "//INJECTX.burpcollaborator.net"
  ], 
  "Encoder": [
   "URL-encode key characters"
  ], 
  "UrlEncode": true, 
  "CharsToUrlEncode": "\" ?&", 
  "Grep": [
   "Burp Collaborator Server"
  ], 
  "PayloadResponse": false, 
  "NotResponse": false, 
  "NotCookie": false, 
  "TimeOut": 0, 
  "isTime": false, 
  "CaseSensitive": false, 
  "isReplace": false, 
  "ExcludeHTTP": false, 
  "OnlyHTTP": false, 
  "IsContentType": false, 
  "ContentType": "", 
  "NegativeCT": false, 
  "IsResponseCode": false, 
  "ResponseCode": "", 
  "NegativeRC": false, 
  "MatchType": 1, 
  "RedirType": 4, 
  "MaxRedir": 5, 
  "rCookies": false, 
  "spaceEncode": false, 
  "payloadPosition": 1, 
  "sEncode": "", 
  "payloadsFile": "", 
  "grepsFile": "", 
  "IssueName": "HTTP Interaction", 
  "IssueSeverity": "Medium", 
  "IssueConfidence": "Tentative", 
  "IssueDetail": "HTTP Interaction", 
  "RemediationDetail": "HTTP Interaction", 
  "IssueBackground": "HTTP Interaction", 
  "RemediationBackground": "HTTP Interaction"
 }
]