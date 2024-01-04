import 'package:dart_app_crrud_custom/dart_app_crrud_custom.dart' as dart_app_crrud_custom;
import 'dart:convert';
import 'package:http/http.dart' as http;
import 'dart:io';
void main() async {
  // // Đường dẫn API Spring Boot
  // final String apiUrl = 'http://localhost:8084/getAll';

  // // Thực hiện yêu cầu GET
  // final response = await http.get(Uri.parse(apiUrl));

  // // Kiểm tra xem yêu cầu có thành công không
  // if (response.statusCode == 200) {
  //   // Chuyển đổi dữ liệu JSON thành danh sách Dart (List)
  //   List<dynamic> data = json.decode(response.body);

  //   // Xử lý dữ liệu ở đây, ví dụ in ra màn hình
  //   for (var customer in data) {
  //     print('Customer: ${customer['fullname']},Phone : ${customer['phone']}, Birtday: ${customer['birtday']},Address: ${customer['address']}');
  //   }
  // } else {
  //   // Nếu yêu cầu không thành công, in ra lỗi
  //   print('Failed to load data. Status code: ${response.statusCode}');
  // }

  //add
  
 final String apiUrladd = 'http://localhost:8084/addCustomer'; 

  // Nhập dữ liệu từ bàn phím
  print('Nhập thông tin khách hàng:');
  stdout.write('Tên: ');
  String? fullName = stdin.readLineSync();

  stdout.write('ngày sinh: ');
  String? ngaysinh = stdin.readLineSync();

  stdout.write('số điện thoại: ');
  String? phone = stdin.readLineSync();
 stdout.write('địa chỉ: ');
  String? address =stdin.readLineSync();
  // Dữ liệu cần thêm
  Map<String, dynamic> data = {
    'fullname': fullName,
    'birtday': ngaysinh,
    'phone': phone,
     'address': address
  };

  // Chuyển đổi dữ liệu thành định dạng JSON
  String jsonData = jsonEncode(data);

  // Thực hiện yêu cầu POST
  final responses = await http.post(
    Uri.parse(apiUrladd),
    headers: {
      'Content-Type': 'application/json',
    },
    body: jsonData,
  );

  // Kiểm tra xem yêu cầu có thành công không
  if (responses.statusCode == 200) {
    print('Thêm khách hàng thành công');
  } else {
    // In ra thông báo lỗi nếu yêu cầu không thành công
    print('Lỗi: ${responses.statusCode}, ${responses.body}');
  }
}