[
 {
  "Name": "ACTIVE - XSS", 
  "Active": false, 
  "Scanner": 1, 
  "Author": "", 
  "Payloads": [
   "</INJECTX>(1)", 
   "\"></INJECTX>(1)"
  ], 
  "Encoder": [
   "URL-encode key characters"
  ], 
  "UrlEncode": true, 
  "CharsToUrlEncode": " \"=?&#", 
  "Grep": [
   "</INJECTX>(1)", 
   "\"></INJECTX>(1)>"
  ], 
  "PayloadResponse": false, 
  "NotResponse": false, 
  "NotCookie": true, 
  "TimeOut": 0, 
  "isTime": false, 
  "CaseSensitive": false, 
  "isReplace": false, 
  "Replace1": "", 
  "Replace2": "", 
  "ExcludeHTTP": true, 
  "OnlyHTTP": false, 
  "IsContentType": false, 
  "ContentType": "", 
  "NegativeCT": false, 
  "IsResponseCode": true, 
  "ResponseCode": "200", 
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
  "IssueName": "XSS", 
  "IssueSeverity": "High", 
  "IssueConfidence": "Certain", 
  "IssueDetail": "XSS", 
  "RemediationDetail": "XSS", 
  "IssueBackground": "XSS", 
  "RemediationBackground": "XSS"
 }
]